
# NetworkUtil
This is a sample library use for check network connection

## Installing

We can install this library by using gradle

Step 1

```
allprojects {
	repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2

```
dependencies {
	         compile 'com.github.TuonBondol:NetworkUtil:1.0.2'
	}
```

## Sample Using

```
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCheckNetwork.setOnClickListener {
            if(!isNetworkConnected(this)){
                Toast.makeText(this, "Network is not Connected!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Network is Connected!", Toast.LENGTH_LONG).show()
        }
    }
}

```

## Min SDK Version

```
Support Min Sdk version >= 16

```

## Authors

* **Bondol Tuon** - [Bondol Tuon](https://github.com/BondolTuon)

See also the list of [contributors](https://github.com/BondolTuon/NetworkUtil/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md]https://github.com/BondolTuon/NetworkUtil/blob/master/README.md) file for details
