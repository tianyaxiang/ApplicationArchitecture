# ApplicationArchitecture
## 应用目的 

掌握企业应用常用的架构模式

## 应用背景

**收入确认问题**

收入确认问题是商业系统中一个常见问题，关心的是何时将所收到的钱入帐。如果我卖给你杯咖啡，收入确认就很简单：我给你咖啡，收钱，然后立即将钱入帐。
但是很多交易中的收入确认很复杂。例如，你给我一笔预聘费，让我为你提供一年的顾问服务。即使你今天就给我了这笔钱，我可能仍然不能入帐，因为完成服务要一
年时间。可能一个月后你意识到写作会使我的编程技能退化，于是取消了这一合同。解决这一问题的方法之一是每月交预聘费的1/12入帐。

收入确认的规则种类繁多而且易变。这些规则有的是由法律决定 ，有的是由行规决定，还有的是经营决策决定 。收入跟踪变成了一个十分复杂的决定。

### 收入确认问题示例
不想在此深入研究这个问题，因此示例只假定某公司出售三种商品：文字处理软、数据库和电子表格软件。
#### 根据规则
* 当签下一个售出文字处理软件的合同时，所有收入可立即入账。
* 如果售出的是一个电子表格数据，则当天入帐1/3,60天后再入帐1/3,剩下的1/3 90天时入帐
* 如果售出的是数据库，则当天入帐1/3,30天后再入帐1/3,剩下的1/3 60天时入帐

## 应用说明
###  — domain 领域逻辑层的组织模式
#### [领域逻辑模式](https://github.com/tianyaxiang/ApplicationArchitecture/blob/master/domain/README.md)
* 事务脚本（Transaction Script)
* 领域模型（Domain Model)
* 表模块（Table Module)
##应用背景

## 应用源于以下

##  企业应用架构模式（Patterns of Enterprise Application Architecture）思维导图
![Image text](https://github.com/tianyaxiang/ApplicationArchitecture/blob/master/resources/%E4%BC%81%E4%B8%9A%E5%BA%94%E7%94%A8%E6%9E%B6%E6%9E%84%E6%A8%A1%E5%BC%8F.png)


