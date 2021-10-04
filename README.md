# SimpleDagggerHilt
*This project is for learning newly available version of DaggerHilt library which is V-2.38.1.*
# 
Simple implementation of dagger hilt library for dependency injection.
Through which I'm injecting strings with in activity class also in view model. 

I've created two dagger modules. 

1 - AppModule -> Which has app scoped dependencies.

2 - MainActivityModule -> Which has dependencies that live only uptill the main activity is alive.

Both of these modules have got string dependencies which are injected in activity and view model.
