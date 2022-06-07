import { createStore } from 'vuex'
// import {createApp} from 'vue'


const ModuleC = {
	state:{
		name:'tom'
	},
	mutations:{
		updatName(state,payload){
			state.name=payload
		}
	},
	// 孩子模块只能使用自己的东西
	// context 包含很多属性
	// ES6 对象的解构
	actions:{
		// cUpdataName(context){
		cUpdataName({state,rootState,commit,getters}){
			
			setTimeout((resolve,reject)=>{
				// console.log(context)
				commit('updatName','wangwu')
			},1000)
		}
	},
	getters:{
		fullName(state){
			return state.name+'111'
		},
		fullName3(state,getters,rootState){
			return getters.fullName +rootState.counter
		}
	}
}

// 单一状态树
export default createStore({
  state: {
	  counter:1000,
	  students:[
		  {id:101,score:90},
		  {id:102,score:80},
		  {id:103,score:70},
		  {id:104,score:60}
	  ],
	  info:{
		  name:'kobe',
		  age:40,
		  height:1.98
	  }
  },
  mutations: {
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
  },
  // 代替mutation的异步操作 context==store
  actions: {
	  // asynchronousIncrement(context,payload){
		 //  // 官方的图，改state必须经过mutation
		 //  setTimeout(()=>{
			// context.commit('updataInfo')
			// console.log(payload.message1);
			// payload.success()
		 //  },1000)
		 asynchronousIncrement(context,payload){
		 		  // 官方的图，改state必须经过mutation
		 		  
		  return new Promise((resolve,reject)=>{
			  
			  setTimeout(()=>{
			  		context.commit('updataInfo')
					console.log(payload)
					// 调用resolve会调用promise的then
			  		resolve('111')
			  },1000)
			  
		  })
		  }
  },
  modules: {
	  a:{
		state:{},
		mutations:{},
		actions:{},
		getters:{}
	  },
	  b:{
		state:{},
		mutations:{},
		actions:{},
		getters:{}  
	  },
	  c:ModuleC
  },
  // 类似计算属性
  // 第二个参数是getters，死的
  getters:{
	  idScore:state=>{
		  return state.students.filter(s => s.score>=50)
	  },
	  // 第二个aaa就是getters
	  more70stuLength(state,aaa){
		  return aaa.idScore.length
	  },
	  more70stu(state){
		  // 返回一个函数
		  return function(sco){
			  return state.students.filter(s => s.score >= sco)
		  }
	  }
	  
  }
})
