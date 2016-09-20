Slidr
================
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.r0adkll/slidableactivity/badge.svg?style=flat)](https://maven-badges.herokuapp.com/maven-central/com.r0adkll/slidableactivity) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Slidr-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1364) [![Stories in Ready](https://badge.waffle.io/r0adkll/Slidr.png?label=ready&title=Ready)](https://waffle.io/r0adkll/Slidr)

Easily add slide-to-dismiss functionality to your Activity by calling `Slidr.attach(this)` in your `onCreate(..)` method.
This lib is originally from [r0adkll](https://github.com/r0adkll/Slidr) [Simon-Raes](https://github.com/Simon-Raes/Slidr) 

![Slidr Example](images/slidr_gif.gif "Gif Example")

## Usage

An example usage:

```java
public class ExampleActivity extends <Activity|FragmentActivity|ActionBarActivity> {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_example);
        int primary = getResources().getColor(R.color.primaryDark);
        int secondary = getResources().getColor(R.color.secondaryDark);
        Slidr.attach(this, primary, secondary);
	}

}
```

or

```java
public class ExampleActivity extends <Activity|FragmentActivity|ActionBarActivity> {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_example);
        Slidr.attach(this);
	}

}
```

## Configuring

```java
SlidrConfig config = new SlidrConfig.Builder()
	.primaryColor(getResources().getColor(R.color.primary)
	.secondaryColor(getResources().getColor(R.color.secondary)
	.position(SlidrPosition.LEFT|RIGHT|TOP|BOTTOM|VERTICAL|HORIZONTAL)
	.sensitivity(1f)
	.scrimColor(Color.BLACK)
	.scrimStartAlpha(0.8f)
	.scrimEndAlpha(0f)
	.velocityThreshold(2400)
	.distanceThreshold(0.25f)
	.listener(new SlidrListener(){...})
	.build();

Slidr.attach(this, config);

```

---

`Slidr.attach(...)` will return a `SlidrInterface` which gives you access to two methods:

```java
SlidrInterface.lock();
SlidrInterface.unlock();
```

These methods lock or unlock the slidable touch interface.

`SlidrInterface.updatePosition(...)` to update Slider Dismiss direction

`SlidrInterface.getContentView()` which return Slidr base view;

The theme that you use for your sliding activity must have these attributes set:

```xml
<item name="android:windowIsTranslucent">true</item>  
<item name="android:windowBackground">@android:color/transparent</item>
```

Then in the layout of your activity you must give it a background like this;

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/background_material_light">

    ...
```

## Including in your project

Include this line in your gradle build file:

```groovy
compile 'com.jemmyphan:slidr:1.2'
```

## License

	Copyright (c) 2014 Drew Heavner

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an
	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
	either express or implied. See the License for the specific
	language governing permissions and limitations under the License.
