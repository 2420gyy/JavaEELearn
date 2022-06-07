const path = require('path')

module.exports={
	//入口和出口
	entry:'./src/main.js',
	output:{
		// 动态获取路径
		path:path.resolve(__dirname,'dist'),
		filename:'bundle.js'
	},
}