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

document.writeln("<h2>你好呀</h2>")