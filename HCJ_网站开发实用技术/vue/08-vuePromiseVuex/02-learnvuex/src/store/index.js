import { createStore } from 'vuex'
// import {createApp} from 'vue'
import mutations from './mutations.js'
import actions from './actions.js'
import moduleC from './modules/moduleC.js'
// const ModuleC = moduleC

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
  mutations,
  // 代替mutation的异步操作 context==store
  actions,
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
	  c:moduleC
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
