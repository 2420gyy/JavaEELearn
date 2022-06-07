export default{
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