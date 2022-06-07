<template>
	<div>
		<h2>这里是User界面</h2>
		<h3>用户信息</h3>
		<h3>{{userId}}+{{$route.params.userIdaaa}}</h3>
		<button @click="btnClick">按钮</button>
	</div>
</template>

<script>
	export default{
		name:"User",
		computed:{
			userId(){
				// 拿到路由里面的参数
				return this.$route.params.userIdaaa
			}
		},
		// created() {
		// 	console.log('创建组件之后回调')
		// 	document.title='用户'
		// },
		methods:{
			btnClick(){
				// 导航到不同的URL
				console.log(this.$router)
				// 活跃的路由，保存有数据，可以获取name,path,query,params
				console.log(this.$route)
			}
		}
	}
</script>

<style>
</style>
