<div class="personal_content_left">
    <div class="per_left_user">
        <#if ylrc_home.headPic??>
            <#if ylrc_home.headPic?length gt 0>
                <img src="/photo/view?filename=${ylrc_home.headPic}" id="show-picture-img"/>
            <#else>
                <img src="/home/images/user_icon.jpg" id="show-picture-img"/>
            </#if>
        <#else>
            <img src="/home/images/user_icon.jpg" id="show-picture-img"/>
        </#if>
        <div class="per_left_font">
            ${ylrc_home.username}</div>
        <div class="per_left_font">
            <a id="add-pic-btn">[修改头像]</a>
        </div>

    </div>
    <div class="personal_question">
        <div class="per_left_tab">
            <div class="per_left_tab_list left_tab_1 file-manege">
                <i class="iconfont icon-xinxiguanli"></i>
                <a href="/home/user/index">信息管理</a>
            </div>
            <div class="per_left_tab_list per_left_tab_list_2 manege">
                <div class="per_left_circle"></div>
                <a href="/home/user/index">基本信息</a>
            </div>
            <div class="per_left_tab_list per_left_tab_list_2 password">
                <div class="per_left_circle"></div>
                <a href="/home/user/updatePassword">修改密码</a>
            </div>
            <div class="per_left_tab_list per_left_tab_list_2 pay_password">
                <div class="per_left_circle"></div>
                <a href="/home/user/updatePayPassword">修改支付密码</a>
            </div>
            <div class="per_left_tab_list left_tab_1">
                <i class="iconfont icon-jingpaixiangmu"></i>
                <a href="/home/bidding/apply">竞拍项目</a>
            </div>
            <div class="per_left_tab_list per_left_tab_list_2">
                <div class="per_left_circle"></div>
                <a href="/home/bidding/apply">报名项目</a>
            </div>
            <div class="per_left_tab_list per_left_tab_list_2">
                <div class="per_left_circle"></div>
                <a href="/home/bidding/record">领先项目</a>
            </div>
        </div>
    </div>
</div>