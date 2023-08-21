<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Fashion | Teamplate</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="manifest" href="site.webmanifest">
    <link rel="shortcut icon" type="image/x-icon" href="../assets/img/favicon.ico">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <!-- CSS here -->
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="../assets/css/owl.carousel.min.css">
    <link rel="stylesheet" href="../assets/css/slicknav.css">
    <link rel="stylesheet" href="../assets/css/flaticon.css">
    <link rel="stylesheet" href="../assets/css/progressbar_barfiller.css">
    <link rel="stylesheet" href="../assets/css/gijgo.css">
    <link rel="stylesheet" href="../assets/css/animate.min.css">
    <link rel="stylesheet" href="../assets/css/animated-headline.css">
    <link rel="stylesheet" href="../assets/css/magnific-popup.css">
    <link rel="stylesheet" href="../assets/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="../assets/css/themify-icons.css">
    <link rel="stylesheet" href="../assets/css/slick.css">
    <link rel="stylesheet" href="../assets/css/nice-select.css">
    <link rel="stylesheet" href="../assets/css/style.css">
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue@2.5.16/dist/vue.js"></script>
<script src="https://unpkg.com/babel-polyfill@latest/dist/polyfill.min.js"></script>
<script src="https://unpkg.com/bootstrap-vue@latest/dist/bootstrap-vue.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body class="full-wrapper">
    <main>
        <!-- breadcrumb Start-->
        <div class="page-notification page-notification2">
            <div class="container">
                
            </div>
        </div>
        <!--? Blog Area Start-->
        <section class="blog_area section-padding">
            <div class="container">
                <div class="row">
<!-- 상품 사진 -->                
                    <div class="col-lg-8 mb-5 mb-lg-0">
                        <div class="blog_left_sidebar">
                            <article class="blog_item">
                                <div class="blog_item_img">
                                    <img class="card-img rounded-0" src="" alt="">
                                </div>
                                <div class="blog_details">
                                    <ul class="blog-info-link">
                                        <li><a href="#"><i class="fa fa-user"></i> Travel, Lifestyle</a></li>
                                        <li><a href="#"><i class="fa fa-comments"></i> 03 Comments</a></li>
                                    </ul>
                                </div>
                            </article>
<!-- 상품 상세 사진 -->
                            <article class="blog_item">
                                <div class="blog_item_img">
                                    <img class="card-img rounded-0" :src="" alt="">
                                </div>
                                <div class="blog_details">
                                </div>
                            </article>
                        </div>
                    </div>
                    
                    
                    <div class="col-lg-4" v-for="vo in product_detail">
                        <div class="blog_right_sidebar">
<!-- 상품 정보 -->
                            <div>
                              <div>
                                <table class="table">
                                  <tr>
                                    <th>ㅇㅇㅇ</th>
                                    <td>{{product_detail.title}}</td>
                                  </tr>
                                  <tr>
                                    <th>ㅇㅇㅇ</th>
                                    <td>{{product_detail.original_pri}}</td>
                                  </tr>
                                  <tr>
                                    <th>ㅇㅇㅇ</th>
                                    <td>{{product_detail.sale}}</td>
                                  </tr>
                                  <tr>
                                    <th>ㅇㅇㅇ</th>
                                    <td>{{product_detail.priced_sale}}</td>
                                  </tr>
                                  <tr>
                                    <th>ㅇㅇㅇ</th>
                                    <td>{{product_detail.brand}}</td>
                                  </tr>
                                  <tr>
                                    <th>ㅇㅇㅇ</th>
                                    <td>{{product_detail.delivery_pri}}</td>
                                  </tr>
                                  <tr>
                                    <th>ㅇㅇㅇ</th>
                                    <td>{{product_detail.score}}</td>
                                  </tr>
                                  <tr>
                                    <th>ㅇㅇㅇ</th>
                                    <td>{{product_detail.review_cnt}}</td>
                                  </tr>
                                </table>
                              </div>
                            </div>
<!-- 검색바 -->
							<!-- <aside class="single_sidebar_widget search_widget">
                                <form action="#">
                                    <div class="form-group">
                                        <div class="input-group mb-3">
                                            <input type="text" class="form-control" placeholder='Search Keyword'
                                            onfocus="this.placeholder = ''"
                                            onblur="this.placeholder = 'Search Keyword'">
                                            <div class="input-group-append">
                                                <button class="btns" type="button"><i class="ti-search"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                    <button class="button rounded-0 primary-bg text-white w-100 btn_1 boxed-btn"
                                    type="submit">Search</button>
                                </form>
                            </aside> -->
                            
                        </div>
                    </div>
                    
                </div>
            </div>
        </section>
        <!-- Blog Area End -->
    </main>
<!-- Scroll Up -->
<div id="back-top" >
    <a title="Go to Top" href="#"> <i class="fas fa-level-up-alt"></i></a>
</div>
<script>
  let productDetail=new Vue({
	  el:'.container',
	  data:{
		  no:${no},
		  product_detail:[],
		  type:${type}
	  },
	  mounted:function(){
		  axios.get('../product/product_detail_vue.do',{
			  params:{
				  no:this.no,
				  type:this.type
			  }
		  }).then(response=>{
			  console.log(response.data)
			  this.product_detail=response.data
		  }).catch(error=>{
			  console.log(error.response)
		  })
	  }
  })
</script>
</body>
</html>