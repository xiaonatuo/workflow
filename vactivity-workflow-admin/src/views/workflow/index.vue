<template>
  <div class="workflow-canvas" ref="workflow-canvas"/>
</template>

<script>
import LogicFlow from '@logicflow/core'
import '@logicflow/core/dist/style/index.css'
export default {
  name: 'Workflow',
  components: {},
  mounted() {
    this.lf = new LogicFlow({
      container: this.$refs['workflow-canvas'],
      grid: true
    })
    this.lf.render()
  }
}
</script>

<style lang="scss" scoped>
.workflow-canvas {
  width: 100%;
  height: 100%;
}
</style>
