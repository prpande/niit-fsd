// Write test code here
const expect = require('chai').expect;
const solution = require('../solution/ticket-booking-bill-calculator');

describe('Solution', function(){
    it('should have function getPerComboPrice',function(){
        expect(typeof solution.getPerComboPrice).to.be.equal('function');
    });

    it('should have function getPerTicketPriceBySeatType',function(){
        expect(typeof solution.getPerTicketPriceBySeatType).to.be.equal('function');
    });

    it('should have function calculateTotalTicketAmount',function(){
        expect(typeof solution.calculateTotalTicketAmount).to.be.equal('function');
    });

    it('should have function calculateTotalComboAmount',function(){
        expect(typeof solution.calculateTotalComboAmount).to.be.equal('function');
    });

    it('should have function calculateTotalBillAmount',function(){
        expect(typeof solution.calculateTotalBillAmount).to.be.equal('function');
    });
});

describe('getPerComboPrice', function(){
    it("should return price for Combo-1", function(){
        const price = solution.getPerComboPrice("Combo-1");
        expect(price).to.be.equal(2.5);
    });

    it('should return error message `Invalid Combo Type` for invalid combo type value', function(){
        const result = solution.getPerComboPrice("Combo-x");
        expect(result).to.be.equal("Invalid Combo Type");
    });
});

describe('getPerTicketPriceBySeatType', function(){
    it('should return per ticket price for Gold seat', function(){
        const price = solution.getPerTicketPriceBySeatType("Gold");
        expect(price).to.be.equal(6);
    });

    it('should return error message `Invalid Seat Type` for invalid seat type value', function(){
        const result = solution.getPerTicketPriceBySeatType("Bronze");
        expect(result).to.be.equal("Invalid Seat Type");
    });
});

describe('calculateTotalTicketAmount', function(){
    it('should return total ticket amount for 2 Silver seats', function(){
        const amount = solution.calculateTotalTicketAmount("Silver", 2);
        expect(amount).to.be.equal(10);
    });

    it('should return error message if ticket count is zero', function(){
        const result = solution.calculateTotalTicketAmount("Silver", 0);
        expect(result).to.be.equal("Incorrect Input, TicketCount cannot be Zero or Negative !!");
    });

    it('should return error message if seat type is invalid', function(){
        const result = solution.calculateTotalTicketAmount("Bronze", 2);
        expect(result).to.be.equal("Invalid Seat Type");
    });
});

describe('calculateTotalComboAmount', function(){
    it('should return total amount for 3 Combo-3', function(){
        const amount = solution.calculateTotalComboAmount("Combo-3", 3);
        expect(amount).to.be.equal(25.5);
    });

    it('should return error message if combo count is zero', function(){
        const result = solution.calculateTotalComboAmount("Combo-3", 0);
        expect(result).to.be.equal("Incorrect Input, ComboCount cannot be Zero or Negative !!");
    });

    it('should return error message if combo type is invalid', function(){
        const result = solution.calculateTotalComboAmount("Combo-x", 3);
        expect(result).to.be.equal("Invalid Combo Type");
    });
});

describe('calculateTotalBillAmount', function(){
    it('should return total booking amount for 2 Platinum seats and 1 Combo-3', function(){
        const amount = solution.calculateTotalBillAmount("Platinum", 2, "Combo-3", 1);
        expect(amount).to.be.equal(24.5);
    });

    it('should return error message if ticket count is negative', function(){
        const result = solution.calculateTotalBillAmount("Platinum", -2, "Combo-3", 1);
        expect(result).to.be.equal("Incorrect Input, TicketCount and ComboCount cannot be Zero or Negative !!");
    });

    it('should return error message if combo count is negative', function(){
        const result = solution.calculateTotalBillAmount("Platinum", 2, "Combo-3", -1);
        expect(result).to.be.equal("Incorrect Input, TicketCount and ComboCount cannot be Zero or Negative !!");
    });
});