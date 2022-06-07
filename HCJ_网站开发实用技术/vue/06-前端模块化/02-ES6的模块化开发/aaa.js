let name = "小明"
var age = 19
var flag = true

export var  height = 1.88
console.log(height)

function sum(sum1,sum2){
	return sum1+sum2;
}
if(flag){
	console.log(sum(20,30));
}
// 导出属性
export{
	flag,sum
}
// 导出函数或类
export class Person{
	run(name){
		console.log(name+"run")
	}
}
// 导出默认的，只能有一个
const address = "北京市"
export default address
