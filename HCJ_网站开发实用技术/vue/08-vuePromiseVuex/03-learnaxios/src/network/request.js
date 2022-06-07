import axios from 'axios'

// 有两种调用的方式
export function request1(config){
	return new Promise((resolve,reject)=>{
		
			const instance = axios.create({
				// baseURL:'http://123.207.32.32:8000',
				baseURL:"/dev-api",
				timeout:5000
			})
			// 1.熟悉步骤和函数调用
			// 2.instance就是一个process，直接返回
			instance(config)
			.then(res=>{
				// 回调？？？？
				// config.sucess(res)
				resolve(res)
			}).catch(err=>{
				reject(err)
			})
		})
}


// export function request1(config){
// 	// 创建全局式的实例
// 	const instance = axios.create({
// 		baseURL:'http://123.207.32.32:8000',
// 		timeout:5000
// 	})
// 	// 1.熟悉步骤和函数调用
// 	instance(config.baseConfig)
// 	.then(res=>{
// 		// 回调？？？？
// 		config.sucess(res)
// 	}).catch(err=>{
// 		config.failure(err)
// 	})
// }


// export function request1(config,success,failure){
// 	// 创建全局式的实例
// 	const instance = axios.create({
// 		baseURL:'http://123.207.32.32:8000',
// 		timeout:5000
// 	})
// 	// 1.熟悉步骤和函数调用
// 	instance(config)
// 	.then(res=>{
// 		// 回调？？？？
// 		success(res)
// 	}).catch(err=>{
// 		failure(err)
// 	})
// }