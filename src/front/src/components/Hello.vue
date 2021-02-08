<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p class="my-3 px-5">
      <b>Кредитный скоринг</b> (от англ.<i> score </i> «оценка»; в т.ч. гл.) — система оценки кредитоспособности
      (кредитных рисков) лица, основанная на численных статистических методах. Как правило,
      используется в потребительском (магазинном) экспресс-кредитовании на небольшие суммы.
      Также возможно его использование в бизнесе сотовых операторов, страховых компаний и т. д.
      Скоринг заключается в присвоении баллов по заполнению некой анкеты, разработанной оценщиками
      кредитных рисков андеррайтерами. По результатам набранных баллов системой автоматически принимается
      решение об одобрении или отказе в выдаче кредита.
    </p>

    <div class="my-5 px-5">
      <router-link to="/start">
        <b-button pill size="lg" variant="info">Ввести данные</b-button>
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Hello',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
