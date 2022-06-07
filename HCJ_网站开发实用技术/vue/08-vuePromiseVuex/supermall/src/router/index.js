import { createRouter, createWebHistory } from 'vue-router'


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
	}
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
