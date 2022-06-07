import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'


createApp(App).use(store).use(router).mount('#app')
import axios from 'axios'

axios({
	url:'/test/person',
}).then(res=>{
	console.log(res);
}).catch(err=>{
	console.log("发生错误1");
})
// axios({
// 	url:'/car/{id}/owner/{username}',
// 针对get请求的参数拼接
// 	params:{
// 		id:3,
// 		username:'lisi'
// 	}
// }).then(res=>{
// 	console.log(res);
// }).catch(err=>{
// 	console.log("发生错误2");
// })
//?type=sell&page=3 => 