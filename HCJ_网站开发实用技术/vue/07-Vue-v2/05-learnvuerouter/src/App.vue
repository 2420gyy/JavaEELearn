<template>
  <div id="app">
	<h2>pushState可以返回，replace不能点</h2>
    <router-link to="/home" tag="button" active-class="active" replace>首页 </router-link>
	<router-link to="/about" active-class="active" replace>关于 </router-link>
	<router-link :to="'/user/'+userId">用户 </router-link>
	<!-- <router-link to="/profile">档案</router-link> 写成对象形式-->
	<router-link :to="{path:'/profile',query:{name:'why',age:18,height:1.73}}">档案</router-link>
	<br />
	<button @click="userClick">用户2</button>
	<button @click="profileClick">档案2</button>
	<br />
	<button @click="homeClick">首页2</button>
	<button @click="aboutClick">关于2</button>
	<router-view v-slot="{ Component }">
	  <keep-alive exclude="Profile">
	    <component :is="Component" />
	  </keep-alive>
	</router-view>
	<!-- <keep-alive>
		<router-view/>
	</keep-alive> -->
	
  </div>
  <!-- <router-view/> 占位-->
</template>

<script>
	export default{
		name:'App',
		data(){
			return{
				userId:"zhangsan"
			}
		},
		methods: {
		    homeClick() {
		      // 通过代码的方式修改路由 vue-router
		      // push => pushState
		      // this.$router.push('/home')
					// replace 不能返回
		      this.$router.replace('/home')
		      console.log('homeClick');
		    },
		    aboutClick() {
		      // this.$router.push('/about')
		      this.$router.replace('/about')
		      console.log('aboutClick');
		    },
			userClick(){
				this.$router.push('/user/'+this.userId)
			},
			profileClick(){
				this.$router.push({
					path:'/profile',
					query:{
						name:'why',age:18,height:1.73
					}
				})
			}
		}
	}
</script>
<style>
	.active{
		color: red;
	}
	
</style>
<!--"eslint:recommended"-->
