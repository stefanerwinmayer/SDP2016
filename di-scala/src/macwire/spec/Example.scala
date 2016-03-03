package macwire.spec

class PointSwitcher()

class TrainCarCoupler()

class TrainShunter(pointSwitcher: PointSwitcher,
                   trainCarCoupler: TrainCarCoupler)

class CraneController()

class TrainLoader(craneController: CraneController,
                  pointSwitcher: PointSwitcher)

class TrainDispatch()

class TrainStation(trainShunter: TrainShunter,
                   trainLoader: TrainLoader,
                   trainDispatch: TrainDispatch) {

  def prepareAndDispatchNextTrain() = ???
}