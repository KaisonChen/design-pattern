# 策略模式
**策略模式：定义了算法族，分别封装起来，让他们之间互相替换，此模式让算法的变化独立于使用算法的客户**

#### 这样设计的好处
- 将行为定义为接口，具体行为做为实现类，可以让行为复用，并让这些行为与Duck无关。当我们新增行为的时候，不会影响到现有的行为类，
也不会影响到使用了这些行为的Duck类。
- 在Duck类中添加行为接口的setter方法，可以让Duck的子类随时随地的改变行为，只需set不同的行为的实体类对象即可。