package com.yitechnology.data

import com.yitechnology.model.Camera

object CameraData {
    fun getCameraListIndoor(): List<Camera>{
        return listOf(
            Camera("YI PRO 2K","https://www2.yitechnology.com/Public/index/images/homecamera.jpg"),
            Camera("YI Home 3 Camera","https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//100/MTA-2558584/xiaomi_xiaomi-yi-home-ip-kamera-cctv--720p--international-version-_full03.jpg"),
            Camera("YI Outdoor 1080p Camera","https://images.tokopedia.net/img/cache/700/OJWluG/2022/9/1/315c6ba8-d495-4175-ad10-1788a4e5e66b.jpg"),
            Camera("YI Dome 1080p Camera","https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full/xiaomi_xiaomi-yi-dome-camera_full04.jpg"),
            Camera("YI Dome X Camera","https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//94/MTA-8811472/yi_xiaomi_yi_dome_x_1080p_ip_camera_cctv_wifi_spy_cam_full03_op8z2hfi.jpg"),
            Camera("YI Dome Guard 2K Camera","https://m.media-amazon.com/images/I/61m5d6TPKvL._AC_UF894,1000_QL80_.jpg"),
            Camera("YI Dome U Camera","https://images.tokopedia.net/img/cache/700/OJWluG/2022/9/1/e17ae2c0-7eb3-4897-baf5-45949ab4fb39.jpg?ect=4g"),
            Camera("YI Dome U Pro Camera","https://images.tokopedia.net/img/cache/700/OJWluG/2022/9/1/536bbdbb-8a46-4a94-bd62-c6b55c573c49.jpg"),
            Camera("YI Outdoor 1080P PTZ Camera","https://yitechnology.com/outdoor-ptz/r40.png")
        )
    }

    fun getDataHome(): List<Camera> {
        return listOf(
            Camera("Living Room","https://www.marthastewart.com/thmb/lxfu2-95SWCS0jwciHs1mkbsGUM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/modern-living-rooms-wb-1-bc45b0dc70e541f0ba40364ae6bd8421.jpg"),
            Camera("Kitchen","https://images.tokopedia.net/img/cache/700/VqbcmM/2023/1/12/42c0e2c2-2ffd-4e62-b2dd-61bf833e0551.jpg"),
            Camera("Bed Room", "https://cdn.decorilla.com/online-decorating/wp-content/uploads/2023/06/Bedroom-interior-design-ideas-for-relaxation.jpg?width=900"),
            Camera("House Enterance", "https://images.prismic.io/parasol/2fdaab63-e938-4593-84b8-14eda10b70c0_Union+-+7.jpg?auto=compress,format&rect=480,0,1920,1920&w=1024&h=1024")
        )
    }
}