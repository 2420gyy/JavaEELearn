export default{
	  //方法
	  // increment事件类型，整体是回调函数
	  // 类型常量 - export const INCREMENT = ''
	  // 都要导入mutation-types.js
	  // [INCREMENT]
	  increment(state){
		  this.state.counter++
	  },
	  decrement(state){
		  this.state.counter--
	  },
	  // 传入count
	  incrementCount(state,payload){
		  this.state.counter+=payload.count
	  },
	  addStu(state,stu){
		  this.state.students.push(stu)
	  },
	  updataInfo(state){
		  // mutation只能是同步的信息，在devtools里面不能跟踪
		  // setTimeout(()=>{
			 //   this.state.info.name = 'coder'
			 //   this.state.info['address']='洛杉矶'
		  // },1000)
		  // this.state.info.name = 'coder'
		  this.state.info['address']='洛杉矶'
		  //set(要修改的对象，索引值，修改后的值)
		  // Vue.set(state.info,'address','洛杉矶')
		  // delete state.info.age //改了。也是响应式，通过代理？？
		  
	  }
  }