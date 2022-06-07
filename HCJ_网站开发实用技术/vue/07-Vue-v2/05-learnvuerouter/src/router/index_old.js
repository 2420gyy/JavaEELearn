import {createRouter} from 'vue-router';
import {createApp} from 'vue'
import Home from '../components/Home.vue'
import About from '../components/About.vue'
// 1.通过Vue.use(插件) ,安装插件

createApp().use(createRouter)
// 2.创建VueRouter对象
// 配置映射关系 routes路径
const routes =[
	{
		path:'/Home',
		component:Home
	},
	{
		path:'/About',
		component:About
	}
	
]
const router = new createRouter({
	// 配置路由和组件之间的关系
	routes
})
// 3.将router对象挂载到Vue实例中
export default router