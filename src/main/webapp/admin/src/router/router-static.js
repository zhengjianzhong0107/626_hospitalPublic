import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import jianchabaogao from '@/views/modules/jianchabaogao/list'
    import xiangmufenlei from '@/views/modules/xiangmufenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jianchaxinxi from '@/views/modules/jianchaxinxi/list'
    import yuyuexinxi from '@/views/modules/yuyuexinxi/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import yisheng from '@/views/modules/yisheng/list'
    import config from '@/views/modules/config/list'
    import yaopinfenlei from '@/views/modules/yaopinfenlei/list'
    import xiangmuxinxi from '@/views/modules/xiangmuxinxi/list'
    import dianzibingli from '@/views/modules/dianzibingli/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '医院公告',
        component: news
      }
      ,{
	path: '/jianchabaogao',
        name: '检查报告',
        component: jianchabaogao
      }
      ,{
	path: '/xiangmufenlei',
        name: '项目分类',
        component: xiangmufenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jianchaxinxi',
        name: '检查信息',
        component: jianchaxinxi
      }
      ,{
	path: '/yuyuexinxi',
        name: '预约信息',
        component: yuyuexinxi
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/yaopinfenlei',
        name: '药品分类',
        component: yaopinfenlei
      }
      ,{
	path: '/xiangmuxinxi',
        name: '项目信息',
        component: xiangmuxinxi
      }
      ,{
	path: '/dianzibingli',
        name: '电子病例',
        component: dianzibingli
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
