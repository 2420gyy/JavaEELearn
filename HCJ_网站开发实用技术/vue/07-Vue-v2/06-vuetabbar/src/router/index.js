import { createRouter, createWebHistory } from 'vue-router'
// // 1. 定义路由组件.
// 也可以从其他文件导入
// const Home = { template: '<div>Home</div>' }
// const About = { template: '<div>About</div>' }
// 2. 定义一些路由
// 每个路由都需要映射到一个组件。
// 我们后面再讨论嵌套路由。
const routes = [
	{
		path:'',
		redirect:'/home'
	},
	{
		path:'/home',
		name:'home',
		component:()=>import('../views/home/Home.vue')
	},
	{
		path:'/category',
		name:'category',
		component:()=>import('../views/category/Category.vue')
	},
	{
		path:'/cart',
		name:'cart',
		component:()=>import('../views/cart/Cart.vue')
	},
	{
		path:'/profile',
		name:'profile',
		component:()=>import('../views/profile/Profile.vue')
	},
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
