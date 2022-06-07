<template>
  <div id="category">
  	<nav-bar class="category-nav">
  		<template v-slot:center>
  			<div>商品分类</div>
  		</template>
  	</nav-bar>	
  </div>
</template>

<script>
	import NavBar from 'components/common/navbar/NavBar.vue'
  export default {
    name: "Category",
		components:{
			NavBar
		}
  }
</script>

<style>
	.category-nav{
		background-color: #FFC0CB;	
	}
</style>
