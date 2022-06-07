<template>
	<div id="home">
		<nav-bar class="home-nav">
			<template v-slot:center>
				<span>购物街</span>
				<span><input type="text" placeholder="搜索商品/店铺" size="8"/></span>
			</template>
		</nav-bar>
		<!-- 父传子绑定 -->
		<home-swiper :banners="banners"/>
		<home-recommend-view :homeRecommends="recommends"/>
		<home-feature-view/>
		<tab-control :titles="['流行','新款','精选']"/>
		<ul>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			<li>列表</li>
			
		</ul>
	</div>
</template>
<!-- 
:banners="banners"
前面绑定的是子组件的属性值
 :key="item.title" 为什么要有key
 padding
 css的display
 -->

<script>
	import NavBar from 'components/common/navbar/NavBar.vue'
	
	import HomeSwiper from './HomeSwiper.vue'
	import HomeRecommendView from './HomeRecommendView.vue'
	import HomeFeatureView from './HomeFeatureView.vue'
	import TabControl from '../../components/content/TabControl.vue'
	
	import {getHomeMultidata} from '../../network/home.js'
  export default {
    name: "Home",
		components:{
			NavBar,
			HomeSwiper,
			HomeRecommendView,
			HomeFeatureView,
			TabControl
		},
		data() {
			return{
				banners:[],
				recommends:[]
			}
		},
		created() {
			// 1.请求多个数据
			getHomeMultidata().then(res=>{
				console.log(res);
				// 保存数据
				this.banners = res.data.banner.list;
				this.recommends = res.data.recommend.list;
			})
		}
  }
</script>

<style>
	#home{
		padding-top: 44px;
	}
	.home-nav{
		background-color: #FFC0CB;
		position: fixed;
		left: 0;
		right: 0;
		top: 0;
		z-index: 9;
	}
</style>
