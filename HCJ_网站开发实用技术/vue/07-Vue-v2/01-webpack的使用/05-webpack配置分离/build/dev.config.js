// 开发时依赖
const webpackMerge = require('webpack-merge')
const baseConfig = require('./base.config')
//高版本，百度 webpackMerge =>{merge}
module.exports = webpackMerge(baseConfig,{
	devServer:{
		// 为哪个文件提供本地服务
		contentBase:'./dist',
		//页面实时刷新
		inline:true
	}
})