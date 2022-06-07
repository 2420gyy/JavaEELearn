<template>
  <div id="nav">
		<main-tab-bar></main-tab-bar>
  </div>
  <router-view/>
</template>

<script>
	import MainTabBar from 'components/content/Maintabbar.vue'
	export default{
		name:'app',
		components:{
			MainTabBar
		}
	}
</script>


<style>
	
	@import url("./assets/css/base.css");
	
</style>
