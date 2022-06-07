const {add,mul} = require('./js/mathUtil.js')
// import {add,mul} from './mathUtil.js'


console.log(add(20,30))
console.log(mul(20,30))

// es6语法也能用，要记得打包
import {name,age} from './js/info.js';
console.log(name+" "+age)

//依赖css文件
require('./css/normal.css')
require('./css/special.less')

// document.writeln("<h2>你好呀</h2>")
//5.使用vue开发
import Vue from 'vue/dist/vue.esm.js'

// import App from './vue/app.js'

import App from './vue/App.vue'

new Vue({
	el:'#app',
	template:'<App/>',
	components:{
		App
	}
})
document.writeln("<h2>热更新2</h2>")