public class Carro {
        private Motor motor;
        private Acessorio roda;
        private Acessorio airbag;
        private Acessorio camera;
        private Acessorio caixaDeSom;

        public Carro(Motor motor, Acessorio roda, Acessorio airbag, Acessorio camera, Acessorio vidroEletrico, Acessorio kitMultimidia, Acessorio caixaDeSom) {
                this.motor = motor;
                this.roda = roda;
                this.airbag = airbag;
                this.camera = camera;
                this.caixaDeSom = caixaDeSom;
        }

        public Motor getMotor() {
                return motor;
        }

        public Acessorio getRoda() {
                return roda;
        }

        public Acessorio getAirbag() {
                return airbag;
        }

        public Acessorio getCamera() {
                return camera;
        }

        public Acessorio getCaixaDeSom() {
                return caixaDeSom;
        }
}
