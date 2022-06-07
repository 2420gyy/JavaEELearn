 var ModuleA = (function(){
	var obj = {}
	
	var flag = true
	
	function sum(num1,num2){
		return num1+num2;
	}
	
	obj.flag = flag;
	obj.sum = sum;
	return obj;
 })()

module.exports = {
	flag,
	sum
}