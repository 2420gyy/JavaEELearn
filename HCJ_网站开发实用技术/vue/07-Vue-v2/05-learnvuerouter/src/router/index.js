import { createRouter, createWebHistory } from 'vue-router'
import Home from '../components/Home.vue'
// import About from '../components/About.vue'
import User from '../components/User.vue';
const routes = [
	{
		path:'/',
		redirect:'home'
	},
  {
    path: '/home',
    name: 'Home',
    component: Home,
	children:[
		{
			// 不写/，和上面不一样
			path:'',
			// 重定向：
			redirect:'/home/news'
		},
		{
			// 不写/
			path:'news',
			name:'新闻',
			component:()=>import('../components/HomeNews.vue')
		},
		{
			path:'homeMessage',
			name:'消息',
			component:()=>import('../components/HomeMessage.vue')
		}
	]
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../components/About.vue')
	// component:About
  },
  {
	//浏览器参数 
	path:'/user/:userIdaaa',
	name:'User',
	component:User
  },
  {
	  path:'/profile',
	  name:'档案',
	  component:()=>import('../components/Profile.vue')
  }
]
// process.env.BASE_URL
const router = createRouter({
  history: createWebHistory(),
  routes
})

//前置守卫(guard)回调的意思
// 全局导航守卫-覆盖内部实现，必须实现next
// router.beforeEach(function(to,from,next){
// })
router.beforeEach((to,from,next)=>{
	// 加meta:{title='首页'}
	document.title = to.name
	next()
})
//后置钩子(hook)回调的意思
router.afterEach((to,from)=>{
	// console.log('---')
})
export default router
