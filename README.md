# XRadarView
:bus: XRadarView is a "A highly customizable radar view for Android". XRadarView 是一个可高度自定义的雷达图控件。

Lastest Version:      
[ ![Download](https://api.bintray.com/packages/orzangleli/maven/xradar/images/download.svg?version=1.0.4) ](https://bintray.com/orzangleli/maven/xradar/1.0.4/link)

## 更新日志

### 1.0.4 更新内容
1. 支持圆形轮廓
2. 支持区域颜色渐变
以上更新感谢 [leixiong033](https://github.com/leixiong033)、[wl386123298](https://github.com/wl386123298) 提出的[issue](https://github.com/hust201010701/XRadarView/issues/1) .

----

## 属性含义

XRadarView 支持高度自定义，其可调整属性及含义如下表所示。

|属性  | 含义 |
|:-------------:|:-------------:|
|count|几边形雷达|
|layerCount|几层蜘蛛网|
|drawableSize|图标的大小|
|drawablePadding|图标和文字间距|
|descPadding|标题描述与节点间距|
|titleSize|标题文字大小|
|dataSize|标题下面的数值的文字大小|
|radarPercent|雷达图图形占整个空间的比例|
|startColor|开启渐变色时，圆心处的颜色|
|endColor|开启渐变色时，外圈处的颜色|
|cobwebColor|正几边形的网线的颜色|
|lineColor|圆心与各个顶点连线的颜色|
|dataColor|数值文本的颜色|
|singleColor|如果不是多色区域，是单一的颜色|
|titleColor|标题文本的颜色|
|pointColor|圆点颜色|
|pointRadius|圆点半径大小|
|borderColor|边界线颜色|
|borderWidth|边界线的宽度|
|radiusColor|半径线的颜色|
|enabledBorder|是否画边界线|
|enabledAnimation|是否开启动画|
|enabledShowPoint|是否显示圆点|
|enabledPolygon|是否绘制网格|
|enabledShade|是否绘制渐变环|
|enabledRadius|是否绘制半径|
|enabledText|是否绘制文本|
|drawables|各项图标组成的数组|
|titles|标题数组(支持SpannableString)|
|percents|各项的值数组（转换成0-1之间的数值）|
|values|值的文本数组|
|colors|多色区域时，每个区域的颜色数组（数组长度可以小于count）|
|enabledRegionShader|是否允许区域颜色渐变|
|isCircle|区域轮廓是否为圆形|

Demo中展示的XRadarView的全面功能(gif很大，github显示不完整已分割成3个Gif，建议查看[Gif原图](http://7bvaky.com2.z0.glb.qiniucdn.com/2017-10-02_22_34_35_xradar.gif))：

![](https://mmbiz.qpic.cn/mmbiz_gif/E7WNiczNxd5zv2Kzkb42oW3Bic4FB9bmLibohZIl4pvk8HKhy2nAnJjic5BVUZwtry2rekAQpAEDVD5rVqb88Yj1lA/0?wx_fmt=gif&tp=webp&wxfrom=5&wx_lazy=1)
![](https://mmbiz.qpic.cn/mmbiz_gif/E7WNiczNxd5zv2Kzkb42oW3Bic4FB9bmLibgsnYHcF0zP9gwFl3P9S2wQk8cS83Sy3eSQhm5GOIj8IbKOB6k5pRyg/0?wx_fmt=gif&tp=webp&wxfrom=5&wx_lazy=1)
![](https://mmbiz.qpic.cn/mmbiz_gif/E7WNiczNxd5zv2Kzkb42oW3Bic4FB9bmLibicqjgOibnP05fygstVuUFxzmldf8Bib3A9IQJHhibXBY9eoS1GOmGia6G3A/0?wx_fmt=gif&tp=webp&wxfrom=5&wx_lazy=1)

你也可以下载本项目的apk体验：

[app-debug.apk](https://github.com/hust201010701/XRadarView/blob/master/app-debug.apk)

# 实战

原图是掌上英雄联盟中雷达图的截图：

![](http://7bvaky.com2.z0.glb.qiniucdn.com/2017-10-02_22_34_35_Screenshot_2017-10-01-11-01-57-516_掌上英雄联盟.png?imageView2/2/w/300)

下图是根据XRadarView设置几个属性简单实现的效果图：

![](http://7bvaky.com2.z0.glb.qiniucdn.com/2017-10-02_22_34_35_Screenshot_2017-10-02-22-27-29-643_RadarView.png?imageView2/2/w/300)

如果您有其它效果的雷达图，可以提交Issues[欢迎提交各种雷达图样式效果图](https://github.com/hust201010701/XRadarView/issues/1)，我会实现好之后贴出来。

# 如何使用
[ ![Download](https://api.bintray.com/packages/orzangleli/maven/xradar/images/download.svg) ](https://bintray.com/orzangleli/maven/xradar/_latestVersion)

XRadarView 添加以下依赖到项目的 build.gradle 文件:

    compile 'com.orzangleli:xradar:1.0.3'

Enjoy it!:smile:

## 技术剖析

本项目的技术剖析将从开发到发布库的整个过程进行详细描述，具体文章请关注微信公众号获取最新文章。

![](http://7bvaky.com2.z0.glb.qiniucdn.com/2017-10-03_15_58_46_qrcode_for_gh_d251874cf21a_430.jpg)

# License

MIT License
