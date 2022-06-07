import axios from 'axios'
export function interceptor({
	const instance = axios.create({
		baseURL:'http://123.207.32.32:8000',
		timeout:5000
	})
	instance.interceptors.request.use(config=>{
		console.log('这是request拦截success');
		
		// 当发送网络请求时，在页面中添加loading组件
		//某些请求必须要求用户登录时，判断是否有token
		//对请求的参数序列化
		config.data = qs.stringify(config.data)
		console.log(config)
		//拦截后要记得返回
		return config
	},err=>{
		console.log('这是request拦截failure');
		return err
	})
	
	instance.interceptors.response.use(response=>{
		console.log('这是response拦截success');
		// 对数据进行过滤
		//返回数据
		return response.data
	},err=>{
		console.log('这是response拦截failure');
		// 根据status判断报错的错误码，跳转到不同的错误提示页面
		if(err && err.response){
			switch(err.response.state){
				case 400:
					err.message ='请求错误'
					break
				case 401:
					err.message = '未授权访问'
					break
			}
		}
		return err
	})
	
	
})