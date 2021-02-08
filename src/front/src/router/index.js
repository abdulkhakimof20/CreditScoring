import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: () => import('../views/About.vue')
  },
  {
    path: '/start',
    name: 'Input',
    component: () => import('../components/ScoringInput.vue')
  },
  {
    path: '/result',
    name: 'Result',
    component: () => import('../components/Result.vue')
  },
  {
    path: '/stats',
    name: 'Stats',
    component: () => import('../views/Stats.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
