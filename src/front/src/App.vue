<template>
  <div id="app">
    <div id="nav">
        <b-navbar type="light" variant="dark">
          <b-navbar-nav>
            <b-nav-item href="#">
              <router-link to="/" class="h4 mb-2">
                <b-icon icon="house" variant="warning"></b-icon>
              </router-link>
            </b-nav-item>
          </b-navbar-nav>

            <b-navbar-nav class="ml-auto">
              <b-nav-item-dropdown class="h4 mb-2" right toggle-class="text-warning">
                <template #button-content >
                  <b-icon icon="gear-fill" aria-hidden="true" variant="warning"></b-icon>
                </template>
                <b-dropdown-item href="#">
                  <router-link to="/stats">Статистика пользователей</router-link>
                </b-dropdown-item>
                <b-dropdown-item href="#">
                  <router-link to="/about">О проекте</router-link>
                </b-dropdown-item>
              </b-nav-item-dropdown>
            </b-navbar-nav>

        </b-navbar>

    </div>
    <router-view/>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  /*padding: 30px;*/
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color : cornflowerblue;
}
</style>
