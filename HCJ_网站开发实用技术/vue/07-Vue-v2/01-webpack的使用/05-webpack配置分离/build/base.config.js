const path = require('path')
const webpack = require('webpack')
// 将index文件自动生成到打包目录
const HtmlWebpackPlugin = require('html-webpack-plugin')
//简化代码
const UglifyjsWebpackPlugin = require('uglifyjs-webpack-plugin')

module.exports={
	//入口和出口
	entry:'./src/main.js',
	output:{
		// 动态获取路径,加build后要注意
		path:path.resolve(__dirname,'../dist'),
		filename:'bundle.js',
		// 打包问题，在url前面加路径
		// publicPath:'dist/'
	},
	module:{
		rules:[
			{
				test:/\.css$/,
				use:['style-loader','css-loader']
			},
			{
				test:/\.less$/,
				use:[{
					loader:"style-loader"
				},{
					loader:"css-loader"
				},{
					loader:"less-loader"
				}]
			},
			{
			        test: /\.(png|jpg|gif)$/,
			        use: [
			          {
			            loader: 'url-loader',
			            options: {
							//小于这个值使用base64模式编译，大于则使用file-loader
			              limit: 8192,
						  // 括号是变量
						  name:'img/[name].[hash:8].[ext]'
			            }
			          }
			        ]
			      },
			{
			      test: /\.js$/,
			      exclude: /(node_modules|bower_components)/,
			      use: {
			        loader: 'babel-loader',
			        options: {
			          presets: ['es2015']
			        }
			      }
			    },
				{
				test:/\.vue$/,
				use:{
					loader:'vue-loader'
				}
				// plugins:[new VueLoaderPlugin()]
				}
		]
	},
	resolve:{
		alias:{
			'Vue$':'vue/dist/vue.esm.js'
		}
	},
	// 在bundle.js前面展示
	plugins:[
		new webpack.BannerPlugin('最终版权归coderywhy所有'),
		new HtmlWebpackPlugin({
			template:'index.html'
		})
		// 开发时不需要这个
		// ,new UglifyjsWebpackPlugin()
	],
	// 打包时这个也不要
	// devServer:{
	// 	// 为哪个文件提供本地服务
	// 	contentBase:'./dist',
	// 	//页面实时刷新
	// 	inline:true
	// }
}