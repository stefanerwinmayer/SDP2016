package scalafx

import scalafx.scene.Scene
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.paint.Color._

object HelloStageDemo extends JFXApp {
  stage = new PrimaryStage {
    title = "Hello Stage"
    width = 600
    height = 450
    scene = new Scene {
      fill = LightGreen
      content = new Rectangle {
        x = 25
        y = 40
        width = 100
        height = 100
        fill <== when(hover) choose Green otherwise Red
      }
    }
  }
}