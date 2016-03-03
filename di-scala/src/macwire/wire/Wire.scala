package macwire.wire

object TrainStation extends App {
  lazy val pointSwitcher = wire[PointSwitcher]
  lazy val trainCarCoupler = wire[TrainCarCoupler]
  lazy val trainShunter = wire[TrainShunter]

  lazy val craneController = wire[CraneController]
  lazy val trainLoader = wire[TrainLoader]
  lazy val trainDispatch = wire[TrainDispatch]

  lazy val trainStation = wire[TrainStation]

  trainStation.prepareAndDispatchNextTrain()
}