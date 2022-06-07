const app = new Vue({
	el:"#shop1",
	data:{
		books:[
			{
				id:1,
				name:"算法导论",
				data:"2006-9",
				price:85.00,
				count:1
			},
			{
				id:2,
				name:"python",
				data:"20016-9",
				price:25.00,
				count:10
			},
			{
				id:3,
				name:"php",
				data:"2016-9",
				price:55.00,
				count:5
			},
			{
				id:4,
				name:"java",
				data:"2011-9",
				price:82.00,
				count:33
			}
		]
	},
	methods:{
		//  “js过滤器” ??
		// getFinalPrice(price){
		// 	return '￥'+ price.toFixed(2)
		// },
		decrease(index){
			this.books[index].count--
		},
		increase(index){
			this.books[index].count++
		},
		removeHandle(index){
			this.books.splice(index,1)
		}
	},
	computed:{
		totalPrice(){
			// let res=0
			// for(let i=0;i<this.books.length;i++){
			// res+=this.books[i].price * this.books[i].count;
			// }
			// return res
			return this.books.reduce(function(pre,book){
				return pre+book.price*book.count
			},0)
		}
		
	},
	filters:{
		showprice(price){
			return '￥'+ price.toFixed(2)
		}
	}

		
})