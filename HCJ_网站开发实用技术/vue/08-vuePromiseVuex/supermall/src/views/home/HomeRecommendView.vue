<template>
	<div class="recommend">
		<!-- :key="item.title" -->
		<div v-for="item in homeRecommends" class="recommend-item">
			<a :href="item.link">
				<img :src="item.image" alt="">
				<div>{{item.title}}</div>
			</a>
		</div>
	</div>
</template>

<script>
	export default{
		name:"HomeRecommendView",
		props:{
			homeRecommends:{
				type:Array,
				default(){
					return []
				}
			}
		}
	}
</script>

<style>
	.recommend{
		display: flex;
		width: 100%;
		text-align: center;
		font-size: 12px;
		padding: 10px 0 20px;
		border-bottom: 8px solid #E9E9E9;
		}
	.recommend-item{
		flex:1;
	}
	.recommend-item img{
		width: 65px;
		height: 65px;
		/* margin-top: 10px; */
	}
</style>
