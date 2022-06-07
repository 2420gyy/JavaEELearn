import { createApp } from 'vue'
import App from './App.vue'
import store from './store'
import axios from 'axios'
createApp(App).use(store).mount('#app')




axios({
	url:'http://123.207.32.32:8000/home/multidata'
}).then((res)=>{
	console.log(res)
})
axios({
	url:'http://123.207.32.32:8000/home/data',
	// 专门针对get请求的参数拼接
	params:{
		type:'pop',
		page:1
	}
}).then((res)=>{
	console.log(res)
})

axios.defaults.baseURL='http://123.207.32.32:8000'

// 2.axios的并发请求
axios.all([axios({
	// baseURL,
	url:'/home/multidata'
}),axios({
	url:'http://123.207.32.32:8000/home/data',
	params:{
		type:'sell',
		page:5
	}
})]).then(axios.spread((res1,res2)=>{
	console.log(res1);
	console.log(res2);
}))
// 上面是数组展开的形式
// .then(res=>{
// 	console.log(res)
// })

// 4.非全局式的，创建对应的axios实例
// 分布式，不同的url地址
const instance1 = axios.create({
	// baseURL:'http://123.207.32.32:8000',
	timeout:5000
})
instance1({
	// url:'/home/multidata'
	url:'http://localhost:8080/test/person'
}).then(res=>{
	console.log(res)
})

instance1({
	url:'/home/data',
	params:{
		type:'pop',
		page:1
	}
}).then(res=>{
	console.log(res)
})

// 5.封装request函数
import {request1} from './network/request.js'
// 什么写法？？？
// request1({
// 	url:''
// },res=>{
// 	console.log('res---------'+res)
// },err=>{
// 	console.log('err---------'+err)
// })
// request1({
// 	baseConfig:{
// 		url:''
// 	},
// 	success:function(res){
// 		console.log(res)
// 	},
// 	failure:function(err){
// 		console.log(err)
// 	},
// })

request1({
	url:'/test/person'
}).then(res=>{
	console.log(res)
}).catch(err=>{
	console.log(err)
})