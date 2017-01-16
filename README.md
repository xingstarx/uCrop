# uCrop - Image Cropping Library for Android

#### This project aims to provide an ultimate and flexible image cropping experience. Made in [Yalantis] (https://yalantis.com/?utm_source=github)

#### [How We Created uCrop] (https://yalantis.com/blog/how-we-created-ucrop-our-own-image-cropping-library-for-android/)
#### Check this [project on Dribbble] (https://dribbble.com/shots/2484752-uCrop-Image-Cropping-Library)

<img src="preview.gif" width="800" height="600">

# Usage

在[uCrop](https://github.com/Yalantis/uCrop) 的基础上添加了几点新特性，用法跟官方的库没有区别

1. 支持在gallery的情况下，重复选择图片（原来的只能选择一张，重复选择，图片会变小）
2. 对于OverLayView是圆角下，支持自定义圆环的borderWidth,borderColor


Add it in your root build.gradle at the end of repositories:

``
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
``

Add the dependency in module build.gradle

```
dependencies {
	        compile 'com.github.xingstarx:uCrop:v0.1.2'
	}
```



## License

    Copyright 2016, Yalantis

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
