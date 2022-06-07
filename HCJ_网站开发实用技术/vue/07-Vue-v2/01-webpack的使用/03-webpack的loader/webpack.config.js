const path = require('path')

module.exports={
	//入口和出口
	entry:'./src/main.js',
	output:{
		// 动态获取路径
		path:path.resolve(__dirname,'dist'),
		filename:'bundle.js',
		// 打包问题，在url前面加路径
		publicPath:'dist/'
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
			    }	  
		]
	}
}