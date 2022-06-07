export default{
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
}
