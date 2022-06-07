<template>
  <div id="cart">
  	<nav-bar class="cart-nav">
  		<template v-slot:center>
  			<div>购物车(0)</div>
  		</template>
  	</nav-bar>	
  </div>
</template>

<script>
	import NavBar from 'components/common/navbar/NavBar.vue'
  export default {
    name: "Cart",
		components:{
			NavBar
		}
  }
</script>

<style>
	.cart-nav{
		background-color: #FFC0CB;
	}

</style>
