<template>
	<div>
		<h2>我是首页</h2>
		<p>内容</p>
		<router-link to="/home/news">新闻</router-link>
		<router-link to="/home/homeMessage">消息</router-link>
		<router-view></router-view>
	</div>
</template>

<script>
	export default{
		name:"Home",
		data() {
			return{
				message:'hello',
				path:'/home/news'
			}
		},
		activated() {
			this.$router.push(this.path)
		},
		beforeRouteLeave(to,from,next) {
			console.log(this.$route.path)
			this.path = this.$route.path
			next()
		}
		// ,created() {
		// 	console.log('创建组件之后回调')
		// 	document.title='首页'
		// },
		// mounted() {
		// 	console.log('template挂载到dom上之后回调')
		// },
		// updated() {
		// 	console.log('界面刷新后回调')
		// }
	}
</script>

<style>
</style>
