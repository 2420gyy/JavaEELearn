// 生产时依赖
// 简化代码
const UglifyjsWebpackPlugin = require('uglifyjs-webpack-plugin')
const webpackMerge = require('webpack-merge')
const baseConfig = require('./base.config')
// {merge}
module.exports = webpackMerge(baseConfig,{
	plugins:[
		new UglifyjsWebpackPlugin()
	]
})