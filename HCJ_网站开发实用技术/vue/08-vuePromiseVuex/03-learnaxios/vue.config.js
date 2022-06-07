module.exports={
    devServer:{
        proxy:{
            ["/dev-api"]:{
            target:'http://localhost:8080',
              changeOrigin:true,
                pathRewrite: {
                    ['^' + "/dev-ap"]: ''
                }
            }
        }

    }
}
