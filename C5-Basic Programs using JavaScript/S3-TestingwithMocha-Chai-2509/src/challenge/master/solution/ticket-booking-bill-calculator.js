function getPerTicketPriceBySeatType(seatType) {
    switch (seatType) {
        case "Silver":
            return 5.0;
        case "Gold":
            return 6.0;
        case "Platinum":
            return 8.0;
        default:
            return "Invalid Seat Type";
    }
}

function calculateTotalTicketAmount(seatType, ticketCount) {
    const ticketPrice = getPerTicketPriceBySeatType(seatType);
    if (ticketPrice === "Invalid Seat Type")
        return ticketPrice;
    if (ticketCount <= 0)
        return "Incorrect Input, TicketCount cannot be Zero or Negative !!";
    return ticketPrice * ticketCount;
}

function getPerComboPrice(comboType) {
    switch (comboType) {
        case "Combo-1":
            return 2.5;
        case "Combo-2":
            return 4.5;
        case "Combo-3":
            return 8.5;
        default:
            return "Invalid Combo Type";
    }
}

function calculateTotalComboAmount(comboType, comboCount) {
    const comboPrice = getPerComboPrice(comboType);
    if (comboPrice === "Invalid Combo Type")
        return comboPrice;
    if (comboCount <= 0)
        return "Incorrect Input, ComboCount cannot be Zero or Negative !!";
    return comboPrice * comboCount;
}

function calculateTotalBillAmount(seatType, ticketCount, comboType, comboCount) {
    if (ticketCount <= 0 || comboCount <= 0)
        return "Incorrect Input, TicketCount and ComboCount cannot be Zero or Negative !!";
    const totalTicketAmount = calculateTotalTicketAmount(seatType, ticketCount);
    const totalComboAmount = calculateTotalComboAmount(comboType, comboCount);
    return totalTicketAmount + totalComboAmount;
}


// do not delete the below code, it is written to export the functions to be tested
module.exports = {
    getPerComboPrice,
    getPerTicketPriceBySeatType,
    calculateTotalTicketAmount,
    calculateTotalComboAmount,
    calculateTotalBillAmount
}
