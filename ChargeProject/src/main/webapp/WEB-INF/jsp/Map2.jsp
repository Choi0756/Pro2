<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    <hr style="background-color:#0C2EB3; margin-top:100px; width: 100%;">

    <!-- ì¶ì² êµ´ê· -->
    <h1 style="color:black;font-family: 'Koulen', cursive; font-size:56px; text-align:center;">Electric Vehicle Charging Station Search</h1>

    <!-- ë¸ëë¼ë²¨ -->
    <div class="row featurette">
        <div class="col-md-3" style="background-color: white; height:600px;">
        <div>
        <h1 style="color:#0034EE; font-family: 'Koulen', cursive; font-size:56px; text-align:center;">SEARCH</h1>
        <hr style="background-color:white;"/>
        <h3 style="color:#0034EE; font-family: 'Koulen', cursive; font-size:24px; margin-left:10px; text-align:left;">Select Region</h3>
       
          <div class="form-group" style="margin-left:10px;">
            <select class="form-control" id="exampleFormControlSelect1">
            <option>전체</option>
            <option>제주시</option>
            <option>한경</option>
            <option>한림</option>
            <option>애월</option>
            <option>조천</option>
            <option>구좌</option>
            <option>대정</option>
            <option>안덕</option>
            <option>중문</option>
            <option>서귀포시</option>
            <option>남원</option>
            <option>표선</option>
            <option>성산</option>
            </select>
        </div>
        
        <h3 style="color:#0034EE; font-family: 'Koulen', cursive; font-size:24px; margin-left:10px; text-align:left;">Charger Type</h3>
       
          <div class="form-group" style="margin-left:10px;">
            <select class="form-control" id="exampleFormControlSelect1">
            <option>전체</option>
            <option>DC차데모</option>
            <option>AC완속</option>
            <option>DC차데모+AC3상</option>
            <option>DC콤보</option>
            <option>DC차데모+DC콤보</option>
            <option>DC차데모+AC3상+DC콤보</option>
            <option>AC3상</option>
            </select>
        </div>
       <hr style="background-color:white;"/>
       <img src="https://github.com/leedongguk/SW-Acadamy-Project/blob/main/image/Transparency%20Icon.png?raw=true" style="margin-left:15%; width: 70%; height: 50%;" />
       <input type="text" name='region' placeholder="REGION" required autofocus class="form-control rounded-pill border-1 shadow-sm px-4" style="margin-left:10px;"/>
       <button type="submit" class="btn btn-Dark btn-block text-uppercase mb-2 rounded-pill shadow-sm" style="background-color:#0034EE; margin-left:10px; color:white;font-family: 'Bebas Neue', cursive;" onclick="location.href='/Home'">SEARCH</button>
       </div>

       </div>
        <div class="col-md-9" style="background-color: white; height:600px; style="margin:0; padding:0;">
            <div id="map" style="width:100%;height:700px"></div>
        </div>
    </div>
    

<!-- /END THE FEATURETTES -->

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=297e5ee86b8292a80bc99ca6b2f04f5e"></script>
<script>
    document.addEventListener("DOMContentLoaded", function() {
        var container = document.getElementById('map');
        var options = {
            center: new kakao.maps.LatLng(33.450701, 126.570667),
            level: 9
        };

        var map = new kakao.maps.Map(container, options);
    });
</script>