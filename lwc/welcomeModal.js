import { LightningElement, track } from 'lwc';

export default class WelcomeModal extends LightningElement {
    @track showModal = false;

    handleShowModal(){
        this.showModal = true;
    }

    handleCloseModal(){
        this.showModal = false;
    }

    handleCloseOutsideModal(event){
        if(!event.currentTarget.contains(event.target)){
            this.showModal = false;
        }
    }
}